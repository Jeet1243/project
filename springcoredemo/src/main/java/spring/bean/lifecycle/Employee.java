package spring.bean.lifecycle;

public class Employee {
		private int eId;
		private String name;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int eId, String name) {
			super();
			this.eId = eId;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [eId=" + eId + ", name=" + name + "]";
		}
		public int geteId() {
			return eId;
		}
		public void seteId(int eId) {
			System.out.println("Setting ID");
			this.eId = eId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			System.out.println("Setting NAme");
			this.name = name;
		}
		
		public void custominit()
		{
			System.out.println("Inside Init Method");
			System.out.println("Making Connections/loading DBMS/Connecting Webservices");
		}
		public void customdestroy()
		{
			System.out.println("Inside Destroy Method");
			System.out.println("Closing Connections/shutting down DBMS/Closing Webservices");
		}
		
		
}
