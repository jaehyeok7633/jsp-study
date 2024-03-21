//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.jsp.repository;

import com.jsp.entity.Dancer;
import com.jsp.entity.Dancer.DanceLevel;
import com.jsp.entity.Dancer.Genre;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DancerRepository {
    private static final Map<String, Dancer> dancerMap = new HashMap();

    public DancerRepository() {
    }

    public static void save(String name, String crewName, String danceLevel, String[] genresArray) {
        Dancer dancer = new Dancer();
        dancer.setName(name);
        dancer.setCrewName(crewName);
        dancer.setDanceLevel(DanceLevel.valueOf(danceLevel));
        List<Dancer.Genre> genres = new ArrayList();
        if (genresArray != null) {
            String[] var6 = genresArray;
            int var7 = genresArray.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                String g = var6[var8];
                genres.add(Genre.valueOf(g));
            }
        }

        dancer.setGenres(genres);
        System.out.println("dancer = " + dancer);
        dancerMap.put(name, dancer);
    }

    public static List<Dancer> findAll() {
        return new ArrayList(dancerMap.values());
    }

    public static void delete(String name) {
        dancerMap.remove(name);
    }
}
