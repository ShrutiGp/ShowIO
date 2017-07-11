/**
 * Created by guptash on 7/10/2017.
 */
import java.util.*;
import java.text.*;
class VehicleDealer{
    String showroom;
    String proprieter;
    double ann_turnover;
    String city;
    Date reg_date;
    VehicleDealer(String s, String p, double an, String c, Date d) {
        showroom = s;
        proprieter = p;
        ann_turnover = an;
        city = c;
        reg_date = d;
    }
    public String toString() {
        return "Showroom : " + showroom + ", Proprieter : " + proprieter + ", Annual Turnover : " + ann_turnover + ", City : " + city + ", Date : " + reg_date;
    }
}

public class ComparatorAssign  {
    public static void main(String args[]) throws Exception
    {   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("21/12/2012");

        VehicleDealer s1 = new VehicleDealer("Honda", "Madhav", 560000000.0, "Delhi", d1);

        Date d2 = sdf.parse("12/12/2012");
        VehicleDealer s2 = new VehicleDealer("Suzuki", "Hasan", 760000000.0, "Hyderabad", d2);

        Date d3 = sdf.parse("20/12/2012");
        VehicleDealer s3 = new VehicleDealer("Renault", "Asif", 980000000.0, "Bangalore", d3);

        Date d4 = sdf.parse("30/12/2012");
        VehicleDealer s4 = new VehicleDealer("Audi", "Sayan", 89890000000.0, "Gurgaon", d4);

        System.out.println("\n\nSorting based on city :  ");
        MyComp1 mc1 = new MyComp1();
        TreeSet<VehicleDealer> ts1 = new TreeSet<VehicleDealer>(mc1);

        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);

        Iterator<VehicleDealer> itr1 = ts1.iterator();

        for(;itr1.hasNext();)
        {
            System.out.println(itr1.next());
        }
        System.out.println("\n\nSorting based on dates :  ");
        MyComp2 mc2 = new MyComp2();
        TreeSet<VehicleDealer> ts2 = new TreeSet<VehicleDealer>(mc2);

        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        ts2.add(s4);

        Iterator<VehicleDealer> itr2 = ts2.iterator();

        for(;itr2.hasNext();)
        {
            System.out.println(itr2.next());
        }

        System.out.println("\n\nSorting based on turnover :  ");
        MyComp3 mc3 = new MyComp3();
        TreeSet<VehicleDealer> ts3 = new TreeSet<VehicleDealer>(mc3);

        ts3.add(s1);
        ts3.add(s2);
        ts3.add(s3);
        ts3.add(s4);

        Iterator<VehicleDealer> itr3 = ts3.iterator();

        for(;itr3.hasNext();)
        {
            System.out.println(itr3.next());
        }
    }
}

class MyComp1 implements Comparator<VehicleDealer> {

    public int compare(VehicleDealer std1, VehicleDealer std2) {

        return std1.city.compareTo(std2.city);

    }
}
class MyComp2 implements Comparator<VehicleDealer> {

    public int compare(VehicleDealer std1, VehicleDealer std2) {

        return std1.reg_date.compareTo(std2.reg_date);

    }
}
class MyComp3 implements Comparator<VehicleDealer> {

    public int compare(VehicleDealer std1, VehicleDealer std2) {
        int i = (int) std1.ann_turnover;
        int i1 = (int) std2.ann_turnover;
        return i-i1;

    }
}