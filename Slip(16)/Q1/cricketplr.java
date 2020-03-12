
import java.io.*;
import java.util.*;

class cricket
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int torun=0,notout=0,played=0;
	String name=" ";
	float avg;
	cricket()throws IOException
	{}
	cricket(int n)throws IOException
	{
  		System.out.println("Enter the Name :");
  		name=br.readLine();
  		System.out.println("Enter the Total Runs:");
  		torun=Integer.parseInt(br.readLine());
  		System.out.println("Enter the no. to NotOut Innings :");
  		notout=Integer.parseInt(br.readLine()); 
  		System.out.println("Enter the no. to Inning Played:");
  		played=Integer.parseInt(br.readLine()); 	
		
		avg=calculates(torun,played);		
	}
	
	public float calculates(int trun,int play)
	{
		float avge=(float)trun/play;
		return avge;
		}
	public void sort(cricket cr,LinkedList list1)throws IOException   
      {
      	System.out.println("\n\n"+list1.size());
      	float temp;
      	int n=0;
      	float avgs[]=new float[list1.size()];
      	for(int i=0;i<list1.size();i++)
      	{
      		cr=(cricket)list1.get(i);
      		avgs[i]=cr.avg;
      		}
      	for(int i=0;i<(avgs.length-1);i++)
      	{
      		if(avgs[i]>avgs[i+1])
      		{
      			temp=avgs[i];
      			avgs[i]=avgs[i+1];
      			avgs[i+1]=temp;
      			}
      			System.out.print(avgs[i]+"\n");
      		}
     	System.out.println("no.\tName\tTotalRuns\tNotOut\tInningsPlayed\tAverage\n\n");	
      	for(int i=(avgs.length-1);i>=0;i--)
      	{
      		for(int j=0;i<list1.size();j++)
      		{
      			cr=(cricket)list1.get(j);
      		    if(avgs[i]==cr.avg)
      		    {
      		    	System.out.print((++n)+"\t");
      		    	System.out.print(cr.name+"\t");
  					System.out.print(cr.torun+"\t\t\t");
  					System.out.print(cr.notout+"\t\t");
  					System.out.print(cr.played+"\t");
  					System.out.print(cr.avg+"\n");
  					break;
      		    	}
      			}
      		}
      		    	
      	}	
}
public class cricketplr
{
	public static void main(String args[])throws IOException
    {
         LinkedList list=new LinkedList();
         cricket critemp;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("How many Recrd:");
  		 int n=Integer.parseInt(br.readLine());
  		 
  		 cricket cri[]=new cricket[n];
  		 for(int i=0;i<n;i++)
  		 {
  		 	cri[i]=new cricket(i);
  		 	list.add(cri[i]);
  		 	}
  		 cricket c=new cricket();   
  		 c.sort(c,list);
         }             
	}

