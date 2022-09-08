package db;

import model.RoomsName;

import java.util.ArrayList;

public class Dtabase {

    public static ArrayList <RoomsName> arlist=new ArrayList<RoomsName>();
        static {
            arlist.add(
                    new RoomsName("room one (T)"," 01")
            );
            arlist.add(
                    new RoomsName("room two (T)"," 02")
            );
            arlist.add(
                    new RoomsName("room three (S)"," 03")
            );
            arlist.add(
                    new RoomsName("room four (S)"," 04")
            ); arlist.add(
                    new RoomsName("room five (D)"," 05")
            ); arlist.add(
                    new RoomsName("room six (D)"," 06")
            ); arlist.add(
                    new RoomsName("room seven (S)"," 07")
            ); arlist.add(
                    new RoomsName("room eight (Q)"," 08")
            );
            arlist.add(
                    new RoomsName("room nine (Q)"," 09")
            );
            arlist.add(
                    new RoomsName("room ten (Q)"," 10")
            );

        }
}
