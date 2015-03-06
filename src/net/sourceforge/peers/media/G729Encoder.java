package net.sourceforge.peers.media;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.CountDownLatch;
import net.sourceforge.peers.Logger;

import net.sourceforge.peers.media.g729.Util;
//import org.sipdroid.codecs.G729;
//import com.example.softdialer.G729;

public class G729Encoder extends Encoder{

	//G729 g729;
	public G729Encoder(PipedInputStream rawData, PipedOutputStream encodedData,
            boolean mediaDebug, Logger logger, String peersHome,CountDownLatch latch) {
        super(rawData, encodedData, mediaDebug, logger, peersHome, latch);
      //  g729 = new G729();
       // g729.open();
    }
	
	@Override
	public byte[] process(byte[] data) {
		//if(data.length != 320) return new byte[20];
		//byte[] newdata = new byte[320];
       // if(data.length > 320)
       // 	System.arraycopy(data,0,newdata,0,320);
       
      return new byte[20];
	}

	@Override
	public void closeEncoder() {
		// TODO Auto-generated method stub
		//g729.close();
	}
	

	

	
}
