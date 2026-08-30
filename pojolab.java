public class pojolab {
    public static void main(String[] args) {

        //emp e = new emp (101,"Rajesh","IT",50000);
        // emp e = new emp(101,"Rajesh","IT",50000);
        // e.setId(102);
        // e.setName("Rajkumar");
        // e.setDept("developer");
        // e.setSalary(80000);
        // // e.show();
        //  System.out.println(e.getId());
        //   System.out.println(e.getName());
        //    System.out.println(e.getDept());
        //    System.out.println(e.getSalary());
         
        // Restaurant r = new Restaurant();
        // r.setRestaurantid(1);
        // r.setName("Hyderabad Paradies");
        // r.setCusion_type("Non veg");
        // r.setAddress("Hyderabad");
        // r.setRateing(8);
        // r.setIsactive(true);


        // Restaurant r1 = new Restaurant();
        // r1.setRestaurantid(2);
        // r1.setName("Hyderabad Bwarchie");
        // r1.setCusion_type("Non veg");
        // r1.setAddress("Hyderabad");
        // r1.setRateing(9);
        // r1.setIsactive(true);

        // Restaurant r2 = new Restaurant();
        // r2.setRestaurantid(3);
        // r2.setName("KFC");
        // r2.setCusion_type("veg");
        // r2.setAddress("Ongole");
        // r2.setRateing(7);
        // r2.setIsactive(true);

        // System.out.println("ID:"+r.getRestaurantid());
        // System.out.println("Restaurant Name:"+r.getName());
        // System.out.println("Type"+r.getCusion_type());
        // System.out.println("Address is:"+r.getAddress());
        // System.out.println("Rateing:"+r.getRateing());
        // System.out.println("Open:"+r.isIsactive());
    
        // System.out.println("ID:"+ r1.getRestaurantid());
        // System.out.println("Restaurant Name:"+r1.getName());
        // System.out.println("Type"+r1.getCusion_type());
        // System.out.println("Address is:"+r1.getAddress());
        // System.out.println("Rateing:"+r1.getRateing());
        // System.out.println("Open:"+r1.isIsactive());

        // System.out.println("ID:"+r2.getRestaurantid());
        // System.out.println("Restaurant Name:"+r2.getName());
        // System.out.println("Type"+ r2.getCusion_type());
        // System.out.println("Address is:"+r2.getAddress());
        // System.out.println("Rateing:"+r2.getRateing());
        // System.out.println("Open:"+r2.isIsactive());


        Menu m = new Menu();
        m.setMenuid(1);
        m.setRestaurantid(11);
        m.setItemname("Mutton dum Biriyani");
        m.setDescription("Mutton");
        m.setPrice(350);
        m.setIs_available(true);

         Menu m1 = new Menu();
        m1.setMenuid(2);
        m1.setRestaurantid(12);
        m1.setItemname("Chicken dum Biriyani");
        m1.setDescription("Chicken");
        m1.setPrice(250);
        m1.setIs_available(true);

         Menu m2 = new Menu();
        m2.setMenuid(3);
        m2.setRestaurantid(13);
        m2.setItemname("Prawn dum Biriyani");
        m2.setDescription("Prawn");
        m2.setPrice(500);
        m2.setIs_available(true);

        System.out.println("Menu Id is : " + m.getMenuid());
        System.out.println("Restaurant id is : " + m.getRestaurantid());
        System.out.println("Item name :" + m.getItemname());
        System.out.println("Description : " + m.getDescription());
        System.out.println("Price : " + m.getPrice());
        System.out.println("Available : " + m.isIs_available());

        System.out.println("Menu Id is : " + m1.getMenuid());
        System.out.println("Restaurant id is :" + m1.getRestaurantid());
        System.out.println("Item name :" + m1.getItemname());
        System.out.println("Description : " + m1.getDescription());
        System.out.println("Price : " + m1.getPrice());
        System.out.println("Available : " + m1.isIs_available());

        System.out.println("Menu Id is : " + m2.getMenuid());
        System.out.println("Restaurant id is : " + m2.getRestaurantid());
        System.out.println("Item name :" + m2.getItemname());
        System.out.println("Description : " + m2.getDescription());
        System.out.println("Price : " + m2.getPrice());
        System.out.println("Available : " + m2.isIs_available());

        
    }
}

