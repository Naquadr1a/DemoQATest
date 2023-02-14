package data;

import java.util.Calendar;
import java.util.Date;

public class Data
{
    private final String URL = "https://demoqa.com";

    //User info
    private final String firstName = "Alex";
    private final String secondName = "Somers";
    private final String email = "a.somers@outlook.com";
    private final String mobile = "1337149655";
    private final String subject = "Maths";
    private final String address = "Stanisława Mikołajczyka 11, 03-984 Warszawa, Poland";
    private final String state = "Haryana";
    private final String city = "Panipat";

    public String getState()
    {
        return state;
    }

    public String getCity()
    {
        return city;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getAddress()
    {
        return address;
    }

    public String getURL()
    {
        return URL;
    }
}
