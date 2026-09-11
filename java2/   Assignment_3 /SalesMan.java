public class SalesMan {
        private String FirstName;
        private String LastName;
        private double SalesAmount;
        public SalesMan(String newFirstName, String newLastName, double newSalesAmount)
        {
            FirstName = newFirstName;
            LastName = newLastName;
            SalesAmount = newSalesAmount;
        }
        public void setFirstName( String newFirstName )
        {
            FirstName = newFirstName;
        }
        public void setLastName( String newLastName )
        {
            LastName = newLastName;
        }
        public void setSalesAmount( double newSalesAmount )
        {
            SalesAmount = newSalesAmount;
        }
        public String getFirstName()
        {
            return FirstName;
        }
        public String getLastName()
        {
            return LastName;
        }
        public double getSalesAmount()
        {
            return SalesAmount;
        }
}
