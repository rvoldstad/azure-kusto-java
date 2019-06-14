package com.microsoft.azure.kusto.data;

import java.net.URISyntaxException;
import org.apache.http.client.HttpClient;


public class ClientFactory {

    public static Client createClient(ConnectionStringBuilder csb) throws URISyntaxException {
        return new ClientImpl(csb);
    }

    public static Client createClient(ConnectionStringBuilder csb, HttpClient httpClient) throws  URISyntaxException {
        return new ClientImpl(csb, httpClient);
    }
}
