package model;

public class Manager
{
	private String ManagerPosition;
	private int ManagerId;
	public Manager(String ManagerPosition,int MnagerId)
	{
		this.ManagerPosition=ManagerPosition;
		this.ManagerId=MnagerId;
		
	}
	public String getManagerPosition() {
		return ManagerPosition;
	}
	public int getManagerId() {
		return ManagerId;
	}
}
