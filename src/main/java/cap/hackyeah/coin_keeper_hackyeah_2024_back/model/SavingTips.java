package cap.hackyeah.coin_keeper_hackyeah_2024_back.model;

import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
public class SavingTips {

    private List<String> tips = List.of("Planuj budżet.",
            "Unikaj impulsywnych zakupów.",
            "Korzystaj z promocji.",
            "Gotuj w domu.",
            "Ogranicz jedzenie na mieście.",
            "Używaj listy zakupów.",
            "Spłacaj karty kredytowe na czas.",
            "Kupuj używane przedmioty.",
            "Oszczędzaj energię elektryczną.",
            "Zainwestuj w energooszczędne urządzenia.",
            "Rób zakupy poza sezonem.",
            "Korzystaj z transportu publicznego.",
            "Porównuj ceny online.",
            "Zrezygnuj z subskrypcji, których nie używasz.",
            "Odkładaj drobne kwoty.",
            "Zamiast kupować, wypożyczaj.",
            "Naprawiaj zamiast wyrzucać.",
            "Zrezygnuj z marek premium.",
            "Zmieniaj dostawców usług.",
            "Zainstaluj termostat programowalny.",
            "Unikaj długów konsumpcyjnych.",
            "Korzystaj z kuponów rabatowych.",
            "Zrezygnuj z niepotrzebnych opłat bankowych.",
            "Kupuj produkty z długim terminem ważności.",
            "Planuj posiłki z wyprzedzeniem.",
            "Zakładaj automatyczne przelewy na konto oszczędnościowe.",
            "Korzystaj z lamp LED.",
            "Wyłączaj urządzenia w trybie czuwania.",
            "Unikaj jednorazowych produktów.",
            "Kupuj lokalnie i sezonowo.",
            "Wybieraj sklepy z cashbackiem.",
            "Negocjuj ceny.",
            "Oszczędzaj na wodzie.",
            "Sprzedaj nieużywane rzeczy.",
            "Zrezygnuj z kawy na wynos.",
            "Kupuj w większych opakowaniach.",
            "Korzystaj z aplikacji śledzących wydatki.",
            "Rób własne napoje i soki.",
            "Naprawiaj ubrania zamiast kupować nowe.",
            "Ogranicz prenumeraty.",
            "Kupuj bilety lotnicze z wyprzedzeniem.",
            "Zainwestuj w termiczną odzież.",
            "Kupuj w second-handach.",
            "Rozważ zamienniki marek.",
            "Używaj butelek wielokrotnego użytku.",
            "Zamiast taksówki, spaceruj.",
            "Korzystaj z darmowych wydarzeń kulturalnych.",
            "Rozważ używane samochody.",
            "Oszczędzaj na kosmetykach DIY.",
            "Inwestuj w jakość, nie ilość.");

    public String getRandomTip(){
        return tips.get(new Random().nextInt(tips.size()));
    }

}
