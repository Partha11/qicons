package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) {
            return _PencilSquare!!
        }
        _PencilSquare = ImageVector.Builder(
            name = "Outlined.PencilSquare",
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
                moveToRelative(16.862f, 4.487f)
                lineToRelative(1.687f, -1.688f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.652f, 2.652f)
                lineTo(10.582f, 16.07f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.897f, 1.13f)
                lineTo(6f, 18f)
                lineToRelative(0.8f, -2.685f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.13f, -1.897f)
                lineToRelative(8.932f, -8.931f)
                close()
                moveTo(16.862f, 4.487f)
                lineTo(19.5f, 7.125f)
                moveTo(18f, 14f)
                verticalLineToRelative(4.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 21f)
                lineTo(5.25f, 21f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.75f)
                lineTo(3f, 8.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 6f)
                lineTo(10f, 6f)
            }
        }.build()

        return _PencilSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSquare: ImageVector? = null
