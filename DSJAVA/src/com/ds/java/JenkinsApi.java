package com.ds.java;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;



public class JenkinsApi {
	public ArrayList<String> getIdleVmsList() {

		  String response = callAPI("http://192.168.1.1:8080/computer/api/json");
		  return parseResponse(response);

		 }

		 public ArrayList<String> parseResponse(String response) {

		  ArrayList<String> idleVm = new ArrayList<String>();

		  JSONObject stat = new JSONObject(response);
		  JSONArray computer = stat.getJSONArray("computer");

		  for (int i = 0; i < computer.length(); i++) {
		   JSONObject info = (JSONObject) computer.get(i);
		   info.getJSONObject("monitorData");
		   String master = (String) info.get("displayName");
		   Boolean vmOfflineStatus = (Boolean) info.get("offline");
		   Boolean vmIdleStatus = (Boolean) info.get("idle");
		   if (!vmOfflineStatus && vmIdleStatus && !master.equalsIgnoreCase("master")) {
		    idleVm.add((String) info.get("displayName"));

		   }

		  }

		  return idleVm;

		 }

		 public static String callAPI(String Url) {
		  Client client = Client.create();
		  try {
		   client.addFilter(new HTTPBasicAuthFilter("username", "pwd"));
		   WebResource webResource = client.resource(Url);
		   ClientResponse response = webResource.get(ClientResponse.class);
		   String jsonResponse = response.getEntity(String.class);

		   client.destroy();
		   return jsonResponse;
		  } catch (Exception e) {
		   return "couldnot call jenkins get API";
		  }

		 }
		 public  String abortJob(String jobName, String buildNumber) {
			  String abortURL = "http://192.168.1.1:8080/job/" + jobName + "/"+buildNumber+"/stop";
			  Client client = Client.create();

			  client.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter("taas", "taas"));
			  WebResource webResource = client.resource(abortURL);
			  ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, null);
			  String jsonResponse = response.getEntity(String.class);
			  client.destroy();
			  return jsonResponse;

			 }

}
