package in.shrutisinha.billingsoftware.service;

import in.shrutisinha.billingsoftware.io.ItemRequest;
import in.shrutisinha.billingsoftware.io.ItemResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ItemService {

    ItemResponse add(ItemRequest request, MultipartFile file) throws IOException;

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);
}

