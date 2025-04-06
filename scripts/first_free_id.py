#!/usr/bin/env python3

import os


def first_free_id(content):
    lines = content.strip().split("\n")

    ids = set()
    for line in lines:
        col = line.split("|")[3].strip()
        ids.add(int(col) if col.isdigit() else 0)

    return min(set(range(1, 1000)) - ids)


def main():
    root_dir = os.path.abspath(os.path.join(os.path.dirname(__file__), ".."))
    algorithms_path = os.path.join(root_dir, "ALGORITHMS.md")

    with open(algorithms_path, encoding="utf-8") as file:
        content = file.read()
    print(first_free_id(content))


if __name__ == "__main__":
    main()
