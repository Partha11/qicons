package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) {
            return _ChevronDoubleUp!!
        }
        _ChevronDoubleUp = ImageVector.Builder(
            name = "Outlined.ChevronDoubleUp",
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
                moveToRelative(4.5f, 18.75f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(7.5f, 7.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(4.5f, 12.75f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(7.5f, 7.5f)
            }
        }.build()

        return _ChevronDoubleUp!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleUp: ImageVector? = null
