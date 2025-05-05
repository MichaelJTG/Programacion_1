package negocio;

import java.util.ArrayList;
import java.util.List;

import javabeans.Region;

public class RegionDaoImplList implements IRegionDao{
	
	private List<Region> lista;
	
	public RegionDaoImplList() {
		lista = new ArrayList<Region>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Region(1,"Europa"));
		lista.add(new Region(2,"Asia"));
		lista.add(new Region(3,"Africa"));
		lista.add(new Region(4,"America"));
		lista.add(new Region(5,"Oceanía"));
		
	}

	@Override //comparacion con int que no es igual que con strring
	public Region findById(Integer atributoPk) {
		for (Region region: lista) {
			if (region.getRegionId() == atributoPk)
				return region;
		}
		return null;
	}

	@Override //usamos un dato tipo region 
	public int insertOne(Region objeto) {
		if (lista.contains(objeto)) {
			return 0;
		}
		else {
			lista.add(objeto);
			return 1;
		}
	}

	@Override //Busqueda o cmparacion por posicion en la lista`
	public int updateOne(Region objeto) {
		int posicion = lista.indexOf(objeto);
		if (posicion != -1) {
			lista.set(posicion, objeto);
			return 1;
		}else
			return 0;
	}

	@Override // eliminar usando lo que nos pasan
	public int deleteById(Integer atributoPk) {
	/*	Region region = findById(atributoPk);
		return deleteByObjeto(region);
	*/	
		return deleteByObjeto(findById(atributoPk));
		 
	}

	@Override
	public int deleteByObjeto(Region objeto) {
		// TODO Auto-generated method stub
		return  lista.remove(objeto)   ? 1 : 0;
	/*	
		if ( lista.remove(objeto))
			return 1;
		else
			return 0;
		*/
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
