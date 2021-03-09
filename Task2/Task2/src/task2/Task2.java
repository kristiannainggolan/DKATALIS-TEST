/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.IOException;
import java.net.*;
import java.net.URL;

/**
 *
 * @author MSI
 */
public class Task2 {

    static HttpURLConnection conn;

    public static void main(String args[]) throws IOException {
        URL url = new URL("https://reqres.in/api/users/3");
        Task2.conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responsecode = conn.getResponseCode();
        System.out.println(responsecode);
    }
}
