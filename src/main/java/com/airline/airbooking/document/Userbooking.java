package com.airline.airbooking.document;

import java.util.ArrayList;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Userbooking {
  @Id
  private String loginemail;
  private ArrayList<UserArray> userdata;

  public String getLoginemail() {
      return loginemail;
  }

  public void setLoginemail(String loginemail) {
      this.loginemail = loginemail;
  }

  public ArrayList<UserArray> getUserdata() {
      return userdata;
  }

  public void setUserdata(ArrayList<UserArray> userdata) {
      this.userdata = userdata;
  }

  @Override
  public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((loginemail == null) ? 0 : loginemail.hashCode());
      result = prime * result + ((userdata == null) ? 0 : userdata.hashCode());
      return result;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj)
          return true;
      if (obj == null)
          return false;
      if (getClass() != obj.getClass())
          return false;
      Userbooking other = (Userbooking) obj;
      if (loginemail == null) {
          if (other.loginemail != null)
              return false;
      } else if (!loginemail.equals(other.loginemail))
          return false;
      if (userdata == null) {
          if (other.userdata != null)
              return false;
      } else if (!userdata.equals(other.userdata))
          return false;
      return true;
  }

  @Override
  public String toString() {
      return "Userbooking [loginemail=" + loginemail + ", userdata=" + userdata + "]";
  }

  public Userbooking(String loginemail, ArrayList<UserArray> userdata) {
      this.loginemail = loginemail;
      this.userdata = userdata;
  }

  
}