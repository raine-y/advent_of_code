use std::fs;

fn main() {
    let input = fs::read_to_string("../input.txt").expect("Failed to read input file");
    let batteries: Vec<String> =
        input.split("\n")
        .map(|line| line.to_string())
        .collect();
}