package com.airline.airbooking.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Email {
@Id
String email;

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
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
    Email other = (Email) obj;
    if (email == null) {
        if (other.email != null)
            return false;
    } else if (!email.equals(other.email))
        return false;
    return true;
}

@Override
public String toString() {
    return "Email [email=" + email + "]";
}
public Email(){
    
}
public Email(String email) {
    this.email = email;
}

}