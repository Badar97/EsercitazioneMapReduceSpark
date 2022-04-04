
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ChallengeMaxFindReducer extends Reducer<Text, IntWritable, IntWritable, Text> {

	Text maxKey;
	int maxValue;

	public void setup(Context context) throws IOException,InterruptedException {
		maxKey=new Text();
		maxValue=0;
	}

	protected void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException { // i primi 2 parametri sono la coppia key-(list of values) )
		
		for (IntWritable value : values) {
			if (value.get() > maxValue) {
				maxValue = value.get();
				maxKey.set(key);
			}
		}
	}

	public void cleanup(Context context) throws IOException,InterruptedException{
             
            context.write(new IntWritable(maxKey.toString().charAt(0)-48), new Text(maxKey.toString().substring(1)));
    }

}
