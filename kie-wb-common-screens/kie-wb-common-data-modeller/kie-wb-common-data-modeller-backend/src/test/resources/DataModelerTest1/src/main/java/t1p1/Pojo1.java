package t1p1;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.TypeSafe(true)
@org.kie.api.definition.type.Role(org.kie.api.definition.type.Role.Type.EVENT)
@org.kie.api.definition.type.Label("Pojo1Label")
@org.kie.api.definition.type.Description("Pojo1Description")
@org.kie.api.definition.type.Duration("duration")
@org.kie.api.definition.type.Timestamp("timestamp")
@org.kie.api.definition.type.ClassReactive
@org.kie.api.definition.type.Expires("1h25m")
public class Pojo1 extends t1p2.Pojo2 implements java.io.Serializable
{

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(0)
    @org.kie.api.definition.type.Key
    @org.kie.api.definition.type.Label("field1Label")
    @org.kie.api.definition.type.Description("field1Description")
    private java.lang.Character field1;

    @org.kie.api.definition.type.Position(1)
    private java.lang.Integer duration;

    @org.kie.api.definition.type.Position(2)
    private java.util.Date timestamp;

    @org.kie.api.definition.type.Position(3)
    @org.kie.api.definition.type.Label("field2Label")
    @org.kie.api.definition.type.Description("field2Description")
    @org.kie.api.definition.type.Key
    private char field2;

    public java.lang.Character getField1()
    {
        return this.field1;
    }

    public void setField1(java.lang.Character field1)
    {
        this.field1 = field1;
    }

    public java.lang.Integer getDuration()
    {
        return this.duration;
    }

    public void setDuration(java.lang.Integer duration)
    {
        this.duration = duration;
    }

    public java.util.Date getTimestamp()
    {
        return this.timestamp;
    }

    public void setTimestamp(java.util.Date timestamp)
    {
        this.timestamp = timestamp;
    }

    public char getField2()
    {
        return this.field2;
    }

    public void setField2(char field2)
    {
        this.field2 = field2;
    }

    public Pojo1()
    {
    }

    public Pojo1(java.lang.Character field1, java.lang.Integer duration,
            java.util.Date timestamp, char field2)
    {
        this.field1 = field1;
        this.duration = duration;
        this.timestamp = timestamp;
        this.field2 = field2;
    }

    public Pojo1(java.lang.Character field1, char field2)
    {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        t1p1.Pojo1 that = (t1p1.Pojo1) o;
        if (field1 != null ? !field1.equals(that.field1) : that.field1 != null)
            return false;
        if (field2 != that.field2)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = 17;
        result = 31 * result + (field1 != null ? field1.hashCode() : 0);
        result = 31 * result + (int) field2;
        return result;
    }

}