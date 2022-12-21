package flight;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

//file system
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;

// box classes
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

// mapreduce 
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class FlightDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

		// Path input_dir = new
		// Path("hdfs://localhost:9000/user/cloudera/vijaysingh/flight.txt");
		// Path output_dir = new
		// Path("hdfs://localhost:9000/user/cloudera/vijaysingh/output");

		Configuration conf = new Configuration();
		Job job = new Job(conf, "Flight");

		job.setJarByClass(FlightDriver.class);
		job.setNumReduceTasks(1);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(FlightWritable.class);

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		job.setMapperClass(FlightMapper.class);
		job.setReducerClass(FlightReducer.class);

		// Setting your input and output directory
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		// output_dir.getFileSystem(job.getConfiguration()).delete(output_dir, true);

		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
