public class HotelReservationMain {

    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.addHotel();

//        hotelReservationSystem.cheapestHotel();

        System.out.println("Cheapest Best Rated hotel for Regular Customers");
        System.out.println();
        hotelReservationSystem.bestRatedCheapHotel(HotelReservationSystem.CustomerType.REGULAR_CUSTOMER);
        System.out.println();

        System.out.println("Cheapest Best Rated hotel for Reward Customers");
        System.out.println();
        hotelReservationSystem.bestRatedCheapHotel(HotelReservationSystem.CustomerType.REWARD_CUSTOMER);
//        hotelReservationSystem.bestRatedHotel();
    }
}
