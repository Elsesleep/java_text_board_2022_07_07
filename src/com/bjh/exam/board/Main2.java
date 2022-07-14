package com.bjh.exam.board;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
  public static void main(String[] args) {
    String queryString1 = "count=1&age=14";
    Map<String, String> params1 = Util.getParams(queryString1);
    System.out.println(params1);

    String queryString2 = "id=33&name=Paul";
    Map<String, String> params2 = Util.getParams(queryString2);
    System.out.println(params2);

    String queryString3 = "id=1&name=Paul";
    Map<String, String> params3 = Util.getParams(queryString3);
    System.out.println(params3);


  }
}
class Util {
  static Map<String, String> getParams(String queryStr) {
    Map<String, String> params = new HashMap<>();

    String[] queryStrBits = queryStr.split("&");

    for (String bit : queryStrBits) {
      String[] bits = bit.split("=");

      params.put(bits[0], bits[1]);
    }

    return params;
  }
}