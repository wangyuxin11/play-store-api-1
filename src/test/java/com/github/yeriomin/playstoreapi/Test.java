package com.github.yeriomin.playstoreapi;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import com.github.yeriomin.playstore.api.ApiBuilderException;
import com.github.yeriomin.playstore.api.GooglePlayAPI;
import com.github.yeriomin.playstore.api.PlayStoreApiBuilder;
import com.github.yeriomin.playstore.api.PropertiesDeviceInfoProvider;
import com.github.yeriomin.playstore.message.DetailsResponse;

public class Test {
	
	public static final String EMAIL = "gpfeedbackmi@gmail.com";
    public static final String PASSWORD = "Linksure20193";
    
    
	public static void main(String[] args) throws IOException {
		
//		GooglePlayAPI api;

		Properties properties = new Properties();
		try {
			properties.load(ClassLoader.getSystemResourceAsStream("device-honami.properties"));
		} catch (IOException e) {
			System.out.println("device-honami.properties not found");
			throw e;
		}

		PropertiesDeviceInfoProvider deviceInfoProvider = new PropertiesDeviceInfoProvider();
		deviceInfoProvider.setProperties(properties);
		deviceInfoProvider.setLocaleString(Locale.ENGLISH.toString());
        //deviceInfoProvider.setTimeToReport(1482626488L);

		
		// Provide valid google account info
        PlayStoreApiBuilder builder = new PlayStoreApiBuilder()
            // Extend HttpClientAdapter using a http library of your choice
            .setHttpClient(new OkHttpClientAdapter())  //OkHttpClientAdapter »¹ÊÇ MockOkHttpClientAdapter
            .setDeviceInfoProvider(deviceInfoProvider)
            .setEmail(EMAIL)
            .setPassword(PASSWORD)
        ;
        
        GooglePlayAPI api;
		try {
			api = builder.build();
			
			// We are logged in now
	        // Save and reuse the generated auth token and gsf id,
	        // unless you want to get banned for frequent relogins
	        System.err.println("Token:" + api.getToken());
	        System.err.println("GsfId:" + api.getGsfId());
	        
	        // API wrapper instance is ready
	        DetailsResponse response = api.details("com.cpuid.cpu_z");
			System.err.println("response.review.commentId="+ response.getUserReview().getCommentId());
		} catch (ApiBuilderException e) {
			e.printStackTrace();
		}
        
        
//		api = new MockGooglePlayAPI();
//		api.setClient(new MockOkHttpClientAdapter());
//		api.setLocale(Locale.US);
//		api.setDeviceInfoProvider(deviceInfoProvider);
//		api.setGsfId(null);
//		api.setToken(null);
		
		
		/*
		 * Exception in thread "main" Error making a live request: Auth error
		 * com.github.yeriomin.playstore.api.AuthException: Authentication failed! (loginAC2DM)
		 */
//		String ac2dmToken = api.generateAC2DMToken(EMAIL, PASSWORD);
//        System.err.println("ac2dmToken : " + ac2dmToken);
		
		//×¢²á£¿
//		api.c2dmRegister("", "", EMAIL, PASSWORD);
        
//        api.generateGsfId(email, ac2dmToken);
        
        /**
        List<String> list = new ArrayList<String>();
        list.add("com.michatapp.im");
        list.add("com.michatapp.im.lite");
        try {
        	BulkDetailsResponse response = api.bulkDetails(list);        	
        } catch(Exception e) {
        	e.printStackTrace();
        }
         */
		
		
		
		/*
		 * 
		 * response.code=401
		 * response.content.length=57
		 * Error making a live request: Auth error
		 */
//		String log = api.log("com.michatapp.im");
//		System.err.println("Log=" + log);
		
		
		
		
		/*
		 * 
		 * Exception in thread "main" Error making a live request: Auth error
		 * com.github.yeriomin.playstore.api.AuthException: Authentication failed! (login)
		 */
//        String token = api.generateToken(EMAIL, PASSWORD);
//        System.err.println("token=" + token);

		
		
	}

}
