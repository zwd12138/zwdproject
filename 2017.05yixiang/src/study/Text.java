package study;

import java.util.ArrayList;
import java.util.List;

public class Text {
	public static void main(String[] args) {	
		String stuStr ="VirtualBox,Vagrant,WebSocket,JSONP,Redis,MongoDB,Cassandra,RabbitMQ,ActiveMQ,Kafka,Lucene,Solr,ElasticSearch,Hadoop,HDFS,HIVE,PIG,Mahout,HBase,Spark,Guava,Protobuf,Avro,Thrift,Motan,Docker,DynamoDB,Scala,Groovy,SpringBoot";
		String[] list = stuStr.split(",");
		List<Student> StuList = new ArrayList<Student>();
		List<Count> CouList = new ArrayList<Count>();
		String str ="ÂÀÅô·É,ElasticSearch,Redis;¶¡»¢ ,Redis,SpringBoot;ÁºĞã¶·,Hadoop,HDFS;ÀîÎÄÅô,Docker,Kafka;Ãçºã·É ,Lucene,Solr;ÙÜê»,Solr,Redis;¶ÅÊÀÑô,ActiveMQ,Hadoop;Áõôæ,SpringBoot,ActiveMQ;Ê·½¨ÖÇ,Docker,Lucene;ÍõË§,Cassandra,Spark;ÕÅ²ı²ı,SpringBoot,MongoDB;ÍõÌÚ·É,SpringBoot,Spark;ÑîĞ¡Æ½,WebSocket,RabbitMQ;";
		String arr[] = str.split(";");
		for(int i=0;i<arr.length;i++){
			String arrStr[] = arr[i].split(",");
			StuList.add(new Student(arrStr[0],arrStr[1],arrStr[2]));
		}						
		for(int i=0;i<list.length;i++){
			Count ct = new Count();		
			ct.setName(list[i]);
			for(int j=0;j<StuList.size();j++){
				if(list[i].equals(StuList.get(j).getStudya())||list[i].equals(StuList.get(j).getStudyb())){
					ct.setList(StuList.get(j).getName());
				}
			}
			CouList.add(ct);
		}
		for(int i=0;i<CouList.size();i++){
			System.out.print(CouList.get(i).getName()+":");
			for(int j=0;j<CouList.get(i).getList().size();j++){
				System.out.print(CouList.get(i).getList().get(j)+",");
			}
			System.out.println();
		}
	}
}
