public enum PaymentWay {
	NET{
		public String getName(){
			return "pay online";
		}
	},
	COD{
		public String getName(){
			return "Cash on delivery";
		}
	},
	BANKREMITTANCE{
		public String getName(){
			return "Bank Transfer";
		}
	},
	POSTOFFICEREMITTANCE{
		public String getName(){
			return "Remittance";
		}
	};
	public abstract String getName();
}
