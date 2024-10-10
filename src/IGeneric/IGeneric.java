package IGeneric;

import java.util.List;

public interface IGeneric<T> {
    public T getById(String Id);
    public List<T> getByName(String Keyword);
}
