package ass3;

import java.net.*;
import java.io.*;
public class Client_Thread {
  public static void main(String[] args) throws Exception {
  try{
    Socket socket=new Socket("127.10.10.1",8888);
    DataInputStream inStream=new DataInputStream(socket.getInputStream());
    DataOutputStream outStream=new DataOutputStream(socket.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String clientMessage="",serverMessage="";
    while(clientMessage!="bye"){
     
      serverMessage=inStream.readUTF();
      System.out.println(serverMessage);
       clientMessage=br.readLine();
      outStream.writeUTF(clientMessage);
      outStream.flush();
    }
    outStream.close();
    outStream.close();
    socket.close();
  }catch(Exception e){
    System.out.println(e);
  }
  }
}
