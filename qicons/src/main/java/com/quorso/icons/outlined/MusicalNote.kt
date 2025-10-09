package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.MusicalNote: ImageVector
    get() {
        if (_MusicalNote != null) {
            return _MusicalNote!!
        }
        _MusicalNote = ImageVector.Builder(
            name = "Outlined.MusicalNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(9f, 9f)
                lineToRelative(10.5f, -3f)
                moveToRelative(0f, 6.553f)
                verticalLineToRelative(3.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.632f, 2.163f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(1.803f, 1.803f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.99f, -3.467f)
                lineToRelative(2.31f, -0.66f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.632f, -2.163f)
                close()
                moveTo(19.5f, 12.553f)
                lineTo(19.5f, 2.25f)
                lineTo(9f, 5.25f)
                verticalLineToRelative(10.303f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.632f, 2.163f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(1.803f, 1.803f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -3.467f)
                lineToRelative(2.31f, -0.66f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15.553f)
                close()
            }
        }.build()

        return _MusicalNote!!
    }

@Suppress("ObjectPropertyName")
private var _MusicalNote: ImageVector? = null
