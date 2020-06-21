package com.airline.airbooking.document;

public class Role {
  String role;
  String msg;
  String name;

  public String getRole() {
      return role;
  }

  public void setRole(String role) {
      this.role = role;
  }

  public String getMsg() {
      return msg;
  }

  public void setMsg(String msg) {
      this.msg = msg;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  @Override
  public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((msg == null) ? 0 : msg.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((role == null) ? 0 : role.hashCode());
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
      Role other = (Role) obj;
      if (msg == null) {
          if (other.msg != null)
              return false;
      } else if (!msg.equals(other.msg))
          return false;
      if (name == null) {
          if (other.name != null)
              return false;
      } else if (!name.equals(other.name))
          return false;
      if (role == null) {
          if (other.role != null)
              return false;
      } else if (!role.equals(other.role))
          return false;
      return true;
  }

  @Override
  public String toString() {
      return "Role [msg=" + msg + ", name=" + name + ", role=" + role + "]";
  }

  public Role(String role, String msg, String name) {
      this.role = role;
      this.msg = msg;
      this.name = name;
  }

  
}