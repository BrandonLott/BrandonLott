package App.repository;

import App.Model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserAccount, Integer> {
    @Query(value="Select sum(packagePrice) from Packages p inner join UserAccount u on p.packageID = " +
            "u.userId", nativeQuery = true)
    public int getTotalPrice();

}
