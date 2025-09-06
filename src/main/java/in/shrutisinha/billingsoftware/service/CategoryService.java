package in.shrutisinha.billingsoftware.service;

import in.shrutisinha.billingsoftware.io.CategoryRequest;
import in.shrutisinha.billingsoftware.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file) throws IOException;

    List<CategoryResponse> read();

    void delete(String categoryId);
}
