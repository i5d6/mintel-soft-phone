package net.sourceforge.peers.media;

import net.sourceforge.peers.media.g729.Util;
//import org.sipdroid.codecs.G729;
//import com.example.softdialer.G729;
public class G729Decoder extends Decoder {


//	G729 g729;
	
	public G729Decoder() {
   
    //    g729 = new G729();
        
     //   g729.open();
   
    }
	
	
    byte[] concatenateByteArrays(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length]; 
        System.arraycopy(a, 0, result, 0, a.length); 
        System.arraycopy(b, 0, result, a.length, b.length); 
        return result;
    }
    
	public byte[] process(byte[] data)
	{
		
    	return null;
	}
	
	
	
	
	/**
     * Perform compression.
     * 
     * @param input
     *            media
     * @return compressed media.
     */
	
	
    private byte[] privateProcess(byte[] media) {
    	
    	
    	return null;
    }


	@Override
	public void stopDecoder() {
		
	}
}
