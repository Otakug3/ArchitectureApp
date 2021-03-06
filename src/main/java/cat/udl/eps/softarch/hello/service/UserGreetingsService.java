package cat.udl.eps.softarch.hello.service;

import cat.udl.eps.softarch.hello.model.Greeting;
import cat.udl.eps.softarch.hello.model.User;
import cat.udl.eps.softarch.hello.utils.XQueryHelper.ShowDTO;

/**
 * Created by http://rhizomik.net/~roberto/
 */
public interface UserGreetingsService {
    User getUserAndGreetings(Long userId);

    Greeting addGreetingToUser(Greeting greeting);

    Greeting updateGreetingFromUser(Greeting updateGreeting, Long greetingId);

    void removeGreetingFromUser(Long greetingId);

	void removeUser(Long id);

	User addUser(String username);

	void addSerieToUser(User u, ShowDTO show);
}
