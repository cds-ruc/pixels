package cn.edu.ruc.iir.pixels.core.writer;

import cn.edu.ruc.iir.pixels.core.TypeDescription;
import cn.edu.ruc.iir.pixels.core.vector.ColumnVector;

/**
 * pixels
 *
 * @author guodong
 */
public class IntegerColumnWriter extends ColumnWriter
{
    public IntegerColumnWriter(TypeDescription schema)
    {
        super(schema);
    }

    @Override
    public void writeBatch(ColumnVector vector)
    {

    }
}
