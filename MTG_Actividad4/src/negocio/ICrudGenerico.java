package negocio;

import java.util.List;

public interface ICrudGenerico<J, ID> {
	
	J  findById(ID atributoPk);
	int insertOne(J objeto);
	int updateOne(J objeto);
	int deleteById(ID atributoPk);
	int deleteByObjeto(J objeto);
	List<J> findAll();
	
	

}
