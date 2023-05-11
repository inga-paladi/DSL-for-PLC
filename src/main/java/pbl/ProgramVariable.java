package pbl;

import java.util.Objects;

public class ProgramVariable implements Comparable<ProgramVariable>
{
    @Override
    public int compareTo(ProgramVariable other) {
        return m_name.compareTo(other.m_name);
    }

    public enum Type {
        Unknown,
        Input,
        Output
    };

    private String m_name;
    private Type m_type;
    private boolean m_value;

    ProgramVariable(String name, Type type, boolean value)
    {
        m_name = name;
        m_type = type;
        m_value = value;
    }

    void SetValue(boolean value)
    {
        m_value = value;
    }
    boolean GetValue() { return m_value; }
    String GetName()
    {
        return m_name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ProgramVariable that = (ProgramVariable) obj;

        return m_value == that.m_value &&
                Objects.equals(m_name, that.m_name) &&
                m_type == that.m_type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_name, m_type, m_value);
    }
}
