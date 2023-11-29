from hw6 import NumsLists


def main():
    # создаем списки чисел
    num_lists = NumsLists([1, 2, 3], [4, 5, 6])

    # расчет среднего значений
    averages = num_lists.get_lists_averages()

    # вывод средних значений
    print(f"The average of list 1 is: {averages[0]}")
    print(f"The average of list 2 is: {averages[1]}")
    # вызов функции сравнения средних значений
    num_lists.compare_averages()


if __name__ == "__main__":
    main()