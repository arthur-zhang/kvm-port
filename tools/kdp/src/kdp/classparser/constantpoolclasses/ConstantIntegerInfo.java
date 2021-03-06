/*
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package kdp.classparser.constantpoolclasses;

import java.io.*;

/**
 * Encapsulates a CONSTANT_Integer item in a Java class file
 * constant pool.
 *
 * @author             Aaron Dietrich
 * @version            $Id: ConstantIntegerInfo.java,v 1.1.1.1 2000/07/07 13:34:24 jrv Exp $
 *
 * Revision History
 *   $Log: ConstantIntegerInfo.java,v $
 *   Revision 1.1.1.1  2000/07/07 13:34:24  jrv
 *   Initial import of kdp code
 *
 *   Revision 1.1.1.1  2000/05/31 19:14:48  ritsun
 *   Initial import of kvmdt to CVS
 *
 *   Revision 1.1  2000/04/25 00:34:06  ritsun
 *   Initial revision
 *
 */
public class ConstantIntegerInfo extends ConstantPoolInfo
  {
   /** the bytes that make up this integer */
   private int            bytes;

   /**
    * Constructor.  Creates this ConstantIntegerInfo structure.
    *
    * @param        iStream            input stream to read from
    *
    * @exception    IOException         pass IOExceptions up
    */
   public ConstantIntegerInfo (DataInputStream iStream) throws IOException
     {
      tag = ConstantPoolInfo.CONSTANT_Integer;

      bytes = iStream.readInt ();
     }

   /**
    * Return this ConstantIntegerInfo as a string.
    *
    * @return       String                integer info as string
    */
   public String toString ()
     {
      return ("CONSTANT_Integer" + "\tValue=" + bytes);
     }
  }
