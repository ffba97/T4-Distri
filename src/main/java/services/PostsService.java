package services;

import abstracts.AbstractBean;
import abstracts.AbstractService;
import beans.Post;
import daos.PostDAO;
import dtos.PostDTO;
import dtos.PostWithCommentsDTO;
import interfaces.beans.IPost;

public class PostsService extends AbstractService<PostDTO> {

	private static final long serialVersionUID = 1L;
	PostDAO pdao = new PostDAO();

	@Override
	protected PostDTO toDTO(AbstractBean bean) {
		return new PostDTO((IPost) bean);
	}
	
	private PostWithCommentsDTO toDTOWithComments (AbstractBean bean) {
		return new PostWithCommentsDTO( (IPost) bean);
	}

	@Override
	public PostDTO[] getAll() {
		return null;
	}

	@Override
	public PostWithCommentsDTO getByID(String id) {
		Post post = pdao.getByID(id);
		return toDTOWithComments(post);
	}

}