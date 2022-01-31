package com.syntax.class27.arraytasks;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceArrayList=
                new ArrayList<>();
        insuranceArrayList.add(new Car("Geico","Tesla S"));
        insuranceArrayList.add(new Pet("Geico","Dog"));
        insuranceArrayList.add(new Health("Geico"));

        for (Insurance in:insuranceArrayList
             ) {
            in.getQuote();
            in.cancelInsurance();
        }
    }
}
