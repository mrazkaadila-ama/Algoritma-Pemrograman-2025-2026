nim = input("Masukkan NIM: ")


digits = []
for char in nim:
    digits.append(int(char))


total = sum(digits)
maks = max(digits)
minim = min(digits)
rata = total / len(digits)


reverse_digits = digits[::-1]

print("Array digit:", digits)
print("Total digit:", total)
print("Digit maksimum:", maks)
print("Digit minimum:", minim)
print("Rata-rata digit:", rata)
print("Reverse array:", reverse_digits)
