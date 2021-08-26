package spring;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface PessoaFisicaRepository extends org.springframework.data.jpa.repository.JpaRepository<PessoaFisica,Integer>{

	
	
	@Override
	default <S extends PessoaFisica> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default <S extends PessoaFisica> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Page<PessoaFisica> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<PessoaFisica> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(PessoaFisica entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends PessoaFisica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	Object clone() throws CloneNotSupportedException;

	@Override
	String toString();

	void finalize() throws Throwable;

	@Override
	default List<PessoaFisica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default List<PessoaFisica> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default List<PessoaFisica> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default <S extends PessoaFisica> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default void deleteInBatch(Iterable<PessoaFisica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	default PessoaFisica getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends PessoaFisica> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

}
