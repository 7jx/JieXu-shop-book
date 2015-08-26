public enum DeliverWay {
	GENERALPOST{
		public String getName(){
			return "Surface mail";
		}
	},
	EXPRESSDELIVERY{
		public String getName(){
			return "Express";
		}
	},
	EXIGENCEEXPRESSDELIVERY{
		public String getName(){
			return "EMS";
		}
	},
	EMS{
		public String getName(){
			return "EMS(china)
			";
		}
	};
	public abstract String getName();
}
