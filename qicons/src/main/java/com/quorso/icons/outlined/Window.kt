package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Window: ImageVector
    get() {
        if (_Window != null) {
            return _Window!!
        }
        _Window = ImageVector.Builder(
            name = "Outlined.Window",
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
                moveTo(3f, 8.25f)
                lineTo(3f, 18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                lineTo(21f, 8.25f)
                moveToRelative(-18f, 0f)
                lineTo(3f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineToRelative(2.25f)
                moveToRelative(-18f, 0f)
                horizontalLineToRelative(18f)
                moveTo(5.25f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(5.25f, 6.008f)
                lineTo(5.25f, 6f)
                close()
                moveTo(7.5f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(7.5f, 6.008f)
                lineTo(7.5f, 6f)
                close()
                moveTo(9.75f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(9.75f, 6.008f)
                lineTo(9.75f, 6f)
                close()
            }
        }.build()

        return _Window!!
    }

@Suppress("ObjectPropertyName")
private var _Window: ImageVector? = null
