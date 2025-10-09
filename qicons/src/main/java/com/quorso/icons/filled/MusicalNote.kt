package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.MusicalNote: ImageVector
    get() {
        if (_MusicalNote != null) {
            return _MusicalNote!!
        }
        _MusicalNote = ImageVector.Builder(
            name = "Filled.MusicalNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.952f, 1.651f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.298f, 0.599f)
                verticalLineTo(16.303f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.176f, 2.884f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(2.553f, 2.553f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.403f, -4.909f)
                lineToRelative(2.311f, -0.66f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.088f, -1.442f)
                verticalLineTo(6.994f)
                lineToRelative(-9f, 2.572f)
                verticalLineToRelative(9.737f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.176f, 2.884f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(2.553f, 2.553f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.402f, -4.909f)
                lineToRelative(2.31f, -0.66f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.088f, -1.442f)
                verticalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.544f, -0.721f)
                lineToRelative(10.5f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.658f, 0.122f)
                close()
            }
        }.build()

        return _MusicalNote!!
    }

@Suppress("ObjectPropertyName")
private var _MusicalNote: ImageVector? = null
