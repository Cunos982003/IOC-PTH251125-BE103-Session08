package re.edu.service;

import jakarta.transaction.Transactional;
import re.edu.dto.request.BookCreateRequest;
import re.edu.dto.request.BorrowCreate;
import re.edu.dto.response.BorrowResponse;

public interface IBorrowService {
    BorrowResponse createBorrow(BorrowCreate dto);

    BorrowResponse returnBook(Long ticketId);

}
