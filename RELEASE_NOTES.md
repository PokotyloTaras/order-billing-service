# Release Notes — v1.1.0

Опис змін у версії **v1.1.0** порівняно з **v1.0.0**.

## Added
* Додано спеціальний базовий тариф доставки `80.0` для Києва (`Kyiv`).
* Додано явний параметр ставки податку `tax_rate` (`taxRate` зі значенням за замовчуванням `0.20` у перевантаженому методі).

## Changed
* Збільшено коефіцієнт вартості доставки за вагу з `12.0` до `15.0` за кілограм.
* Виконано рефакторинг зв'язності модулів із переходом до **Data Coupling**: методи тепер приймають виключно необхідні примітивні параметри (`city`, `weight_kg` / `weightKg`) замість об'єкта `CustomerProfile`.

## Breaking Changes
* Змінено сигнатури функцій розрахунку (`calculateDeliveryCost` більше не приймає `CustomerProfile`; загальний метод `processInvoice` замінено на два спеціалізовані: `process_standard_invoice` / `processStandardInvoice` та `process_tax_exempt_invoice` / `processTaxExemptInvoice`).
* Видалено глобальну змінну `GLOBAL_TAX_RATE` (ліквідація Common Coupling).
* Видалено керуючий прапорець `mode_flag` / `modeFlag` (ліквідація Control Coupling).
