package hu.petrik.szuperhosprojekt;

import java.io.*;
import java.util.ArrayList;

public final class Kepregeny {

    public static ArrayList<Szuperhos> szuperhosLista = new ArrayList<Szuperhos>();

    public static void szereplok(String path)
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String line = reader.readLine();
            while(line != null && !line.isEmpty()){
                String[] segment = line.split(" ");
                if(segment[0] == "Batman")
                {
                    Batman b1 = new Batman();
                    for (int i = 0; i < Integer.parseInt(segment[1]); i++)
                    {
                        b1.kutyutKeszit();
                    }
                    szuperhosLista.add(b1);
                }
                else
                {
                    Vasember v1 = new Vasember();
                    for (int i = 0; i < Integer.parseInt(segment[1]);i++)
                    {
                        v1.kutyutKeszit();
                    }
                    szuperhosLista.add(v1);
                }
            }


        } catch (IOException e) {
            throw new Error("Nincs ilyen file");
        }


    }

    public static void szuperhosok()
    {
        for(Szuperhos item: szuperhosLista)
        {
            System.out.println(item);
        }
    }



}
