public enum SeasonConstructor {
    WINTER {
        public String getHours() { return "10am-3pm"; }
    }, 
    
    SUMMER {
        public String getHours() { return "9am-7pm"; }
    },
    SPRING, FALL;
    
    public String getHours() { return "9am-5pm"; }

    //public abstract String getHours(); //OBLIGA A QUE TODO IMPLEMTEN EL METODO getHours
}
